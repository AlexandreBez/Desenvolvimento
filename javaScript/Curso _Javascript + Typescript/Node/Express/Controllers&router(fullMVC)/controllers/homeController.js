exports.paginainicial = (req, res) => {
    res.send(`
    <form action="/" method="POST">
    Nome do cliente:<input type="text" name="nome">
    <button>Enviar Formulario</button>
    </form>
`);
};

exports.trataPost = (req, res) => {
    res.send('Ei sou sua nova rota de POST');
};

