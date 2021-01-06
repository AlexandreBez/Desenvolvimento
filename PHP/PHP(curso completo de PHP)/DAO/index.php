<?php

require_once("config.php");

// $sql = new Sql();

// $usuarios = $sql->select("SELECT * FROM tb_usuario");

// echo json_encode($usuarios);

//!Carrega um usuario
// $root = new Usuario;

// $root->loadByID(0);

//!carega uma lsita de usuarios

// $lista = Usuario::getlist

//!carrega uma lista buscando pelo login

// $Search = Usuario::search("root");
// echo json_encode($Search);

//!carrega usuario, login e senha

$usuario = new Usuario();
$usuario->login("root", "root");

echo $usuario;

