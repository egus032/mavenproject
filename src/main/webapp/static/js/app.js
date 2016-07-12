(function () {
	"use strict";

	angular.module("app", ["ngResource"])
                .controller("RegFormCtrl", ["$scope", "$http", function ($scope, $http){
                        $scope.master = {};                 
                        $scope.submit = function (){
                            $http({
                               method: "POST",
                               url: "http://localhost:8081/mavenproject/",
                               data: $scope.master,
                               headers : {"Content-Type": "application/json"} 
                            })
                            .success(function(data) {
                                if (data.errors) {
                                  // Showing errors.
                                  $scope.errorName = data.errors.name;
                                  $scope.errorUserName = data.errors.username;
                                  $scope.errorEmail = data.errors.email;
                                } else {
                                  $scope.message = data.message;
                                }
                        });
                        
                        };
                
                    }]);

})();


