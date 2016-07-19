/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("MainController", function( $scope, $http, $location )
{
	/**
	 * 
	 */
	$scope.ref = function( link ){
		$location.url( link );
	};
	
	
	/**
	 * 
	 */
	$scope.msgI18n = function( Prop ){
		return Language[Prop];
	};
});
