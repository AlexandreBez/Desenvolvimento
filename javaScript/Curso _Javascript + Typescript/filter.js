const numeros = [50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];

// const numerosFiltrados = numeros.filter(valor => valor > 10)
const numerosFiltrados = numeros.filter((valor, indice, array) => {
   console.log(valor, indice, array);
    return valor > 10;
});
console.log(numerosFiltrados);


const pessoas = [

    {nome: 'Luiz', idade: 62},
    {nome: 'Maria', idade: 23},
    {nome: 'Eduardo', idade: 55},
    {nome: 'Leticia', idade: 19},
    {nome: 'Rosana', idade: 32},
    {nome: 'Wallace', idade: 47}

];

const pessoasComNomeGrande = pessoas.filter(obj => obj.nome.length >= 5 && obj.idade >= 30 );
const pessoasComFinalA = pessoas.filter( obj => obj.nome.toLowerCase().endsWith('a'));
console.log(pessoasComNomeGrande, pessoasComFinalA);

