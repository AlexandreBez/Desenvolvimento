

function relogio() {
    
    //! Utiliza a data de 1970 1 de janeiro a meia noite

    function criaHoraDosSegundos(segundos) 
    {
        const data = new Date(segundos * 1000);
        return data.toLocaleTimeString('pt-BR', {
          hour12: false,
          timeZone: 'UTC'
        });
    }

    //* Pega o timer aonde vai o "display" da hora

    const relogio = document.querySelector('.relogio');

    //! Mantem os segundos

    let segundos = 0;

    //! variavel para auxiliar na funcao parar

    let timer;

    //! funcao que inicia o relogio

    function iniciaRelogio() {

        timer = setInterval(function () {
            segundos++;
            relogio.innerHTML = criaHoraDosSegundos(segundos);
        }, 1000);

    }

    //* Pega o evento no ato do click nos botoes e faz suas defidas funcoes

    document.addEventListener('click', function (e) {

        const el = e.target;

        if (el.classList.contains('zerar')) {

            clearInterval(timer);
            relogio.innerHTML = '00:00:00';
            relogio.classList.remove('pausado');
            segundos = 0;

        }

        if (el.classList.contains('pausar')) {

            clearInterval(timer);
            relogio.classList.add('pausado');

        }

        if (el.classList.contains('iniciar')) {

            relogio.classList.remove('pausado');
            clearInterval(timer);
            iniciaRelogio();

        }

    });

    //todo Maneira mais trabalhosa e menos performatica

    // iniciar.addEventListener('click', function(event)
    // {

    //     relogio.classList.remove('.pausado');
    //     clearInterval(timer);
    //     iniciaRelogio();

    // });


    // pausar.addEventListener('click', function(event)
    // {

    //     clearInterval(timer);
    //     relogio.classList.add('.pausado');

    // });

    // zerar.addEventListener('click', function(event)
    // {

    //     clearInterval(timer);
    //     relogio.innerHTML = '00:00:00';
    //     segundos = 0;


    // });


}

relogio();
