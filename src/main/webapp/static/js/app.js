(function () {
	"use strict";

	angular.module("app", ["ngResource"])
                .controller("RegFormCtrl", ["$scope", function ($scope){
                        $scope.master = {
                            email: $scope.email,
                            lastname: $scope.lastname,
                            firstname: $scope.firstname,
                            age: $scope.age
                        };                          
                        $scope.submit = function (){
                            
                        };
                }])
                .service("UserCrudApi", ["$resource", function ($resource){
                        return $resource("/", null,{ 
                            indexPagePost: {method: "POST", url: "/"}
                        });
                }]);

})();


