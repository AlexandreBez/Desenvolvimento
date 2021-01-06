<?php

class Usuario {

    private $idusuario;
    private $deslogin;
    private $desenha;
    private $dtcadastro;

    public function getIDusuario() {

        return $this->idusuario;
    }

    public function setIDusuario($value) {

        $this->idusuario = $value;
    }

    public function getdeslogin() {

        return $this->deslogin;
    }

    public function setdeslogin($value) {

        $this->deslogin = $value;
    }

    public function getdesenha() {

        return $this->desenha;
    }

    public function setdesenha($value) {

        $this->desenha = $value;
    }

    public function getdtcadastro() {

        return $this->dtcadastro;
    }

    public function setdtcadastro($value) {

        $this->dtcadastro = $value;
    }

    public function loadByID($id) {

        $sql = new Sql();
        $result = $sql->select("SELECT * FROM tb_usuario WHERE idusuarui = :ID", array(
            ":ID" => $id
        ));

        if (count($result) > 0) {

            $row = $result[0];

            $this -> setIDusuario($row['idusuario']);
            $this -> setdeslogin($row['deslogin']);
            $this -> setdesenha($row['desenha']);
            $this -> setdtcadastro(new DateTime($row['dtcadastro']));
        };
    }

    public function getList() {

        $sql = new Sql();

        return $sql->select("SELECT * FROM tb_usuario ORDER BY deslogin");
    }

    public function search($login) {

        $sql = new Sql();

        return $sql->select("SELECT * FROM tb_usuario WEHRE deslogin LIKE ? ORDER BY deslogin", array(
            ':SEARCH'=>'%'.$login.'%')
        );
    }

    public function login($login, $password) {

        $sql = new Sql();
        $result = $sql->select("SELECT * FROM tb_usuario WHERE deslogin = :LOGIN AND desenha= :PASSWORD", array(
            ":LOGIN" => $login,
            ":PASSWORD"=> $password
        ));

        if (count($result) > 0) {

            $row = $result[0];

            $this -> setIDusuario($row['idusuario']);
            $this -> setdeslogin($row['deslogin']);
            $this -> setdesenha($row['desenha']);
            $this -> setdtcadastro(new DateTime($row['dtcadastro']));
        }else {

            throw new Exception("Login e/ou Senha Incorretos");
        }
    }

    public function __toString(){

        return json_encode(array(
            "idusuario" => $this->getIDusuario(),
            "deslogin" => $this->getdeslogin(),
            "desenha" => $this->getdesenha(),
            "dtcadastro" => $this->getdtcadastro()->format("d/m/Y H:i:s")

        ));
    }

}

