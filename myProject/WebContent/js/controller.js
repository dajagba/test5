app = angular.module('stockInfo',[]);

app.controller('mainCtrl', function($scope) {
	$scope.search = function() {
	    var data = {
	        stockTicker: $scope.stockTicker
	    };

	    var successCallBack = function(response){
	        // success response found from server
	    };

	    var errorCallBack = function(response){
	        // error response found from server
	    };

	    $http.post('http://localhost:8080/SupportSystems/SSystems/authenticateUser', data).then(successCallBack, errorCallBack);
	}
});