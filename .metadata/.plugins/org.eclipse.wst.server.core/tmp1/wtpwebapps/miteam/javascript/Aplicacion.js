var app = angular.module('App', 
	['ngRoute']).config(
	function($routeProvider, $controllerProvider) 
{
	
	app.registerCtrl = $controllerProvider.register;
	$routeProvider
    .when('/', 
    {
    	controller:'DashboardController',
    	templateUrl:'inicio.html'
    })
    
    .when('/usuario/lista', 
    {
    	controller:'UsuarioController',
    	templateUrl:'usuarios/lista-usuarios.html'
    })
 

});