
//http://meusite.com/ <- GET -> Entrega a página /
//http://meusite.com/sobre <- GET -> Entrega a página /sobre

//CRUD -> CREATE, READ, UPDATE, DELETE
//          POST   GET   PUT    DELETE

const express = require('express');
const app = express();
const routes = require('./routes');
const path = require('path');

app.use(express.urlencoded({ exntends: true }));

app.use(express.static(path.resolve(__dirname, 'public')));

app.set('views', path.resolve(__dirname, 'src', 'views'));
app.set('view engine', 'ejs');

app.use(routes);

app.listen(3000, () => {
    console.log('Acessar http://localhost:3000');
    console.log('Servidor executando na porta 3000');
});



