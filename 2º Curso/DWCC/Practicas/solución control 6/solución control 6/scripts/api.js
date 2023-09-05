const ORDENACION_INICIAL = 6;

// Introducimos [nome do xogo,ligazón da páxina]
nomesXogos = new Array(
	['Pac-man','https://en.wikipedia.org/wiki/Pac-Man'],
	['Frogger','https://en.wikipedia.org/wiki/Frogger'],
	['Pole position','https://en.wikipedia.org/wiki/Pole_Position'],
	['Tetris','https://en.wikipedia.org/wiki/Tetris'],
	['Arkanoid','https://en.wikipedia.org/wiki/Arkanoid'],
	['Bubblebobble','https://en.wikipedia.org/wiki/Bubble_Bobble'],
	['Donkey Kong','https://en.wikipedia.org/wiki/Donkey_Kong_(video_game)'],
	['Centipede','https://en.wikipedia.org/wiki/Centipede_(video_game)'],
	['Qbert','https://en.wikipedia.org/wiki/Q*bert'],
	['Burger Time','https://en.wikipedia.org/wiki/BurgerTime'],
	['Pong','https://en.wikipedia.org/wiki/Pong'],
	['Space Invaders','https://en.wikipedia.org/wiki/Space_Invaders']);

// Introducimos [nome do xogador,xogo,pantallas superadas,puntos]
rankingXogadores = new Array(	
	['Billy','Pac-man',255,3333360],
	['Anonymous','Frogger',25,34456],
	['jotaeme','Pac-man',11,50000],
);					

function ordenarVector(vector,campo) {
	switch (campo) {
		case 0:	// ordena polo nome do xogador
		case 1:	// ordena polo nome do xogo
			vector.sort((a, b) => a[campo] > b[campo] ? 1 : -1);
			break;
		case 2:	// ordena polas pantallas superadas
		case 3:	// ordena polos puntos	
			vector.sort((a, b) => b[campo] - a[campo]);
			break;
		case 4: // ordena por pantallas + puntos
			vector.sort((a, b) => b[3] - a[3]).sort((a, b) => b[2] - a[2]);
			break;
		case 5: // ordena por pantallas + puntos + xogador
			vector.sort((a, b) => a[0] > b[0] ? 1 : -1).sort((a, b) => b[3] - a[3]).sort((a, b) => b[2] - a[2]);
			break;
		case 6: // ordena por pantallas + puntos + xogador + xogo
			vector.sort((a, b) => a[1] > b[1] ? 1 : -1).sort((a, b) => a[0] > b[0] ? 1 : -1).sort((a, b) => b[3] - a[3]).sort((a, b) => b[2] - a[2]);
			break;
		default:
			break;		
	}
}	

function validar(nome,contrasinal) {
	if (nome == 'petete' && contrasinal == 'abc123.') usuarioRexistrado();
	else contrasinalIncorrecto();	
}