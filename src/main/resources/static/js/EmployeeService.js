'use strict'
angular.module('demo.services', []).factory('EmployeeService', ["$http", "CONSTANTS", function($http, CONSTANTS) {
    var service = {};
    service.getEmployById = function(Id) {
        var url = CONSTANTS.getEmployeeById + Id;
        return $http.get(url);
    }
    service.getAllUsers = function() {
        return $http.get(CONSTANTS.getAllUsers);
    }
    service.saveUser = function(userDto) {
        return $http.post(CONSTANTS.saveUser, userDto);
    }
    return service;
}]);