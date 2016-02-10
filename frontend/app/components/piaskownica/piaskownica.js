'use strict';

var piaskownicaServices = angular.module('myApp.piaskownica', ['ngResource']);

piaskownicaServices.factory('Piaskownice', function ($resource){
  return $resource("http://localhost:8080/backend-1.0-SNAPSHOT/webresources/piaskownice",{},{
    query: {method:'GET', 
      isArray:true
    },
    queryV2: {method:'GET', 
      isArray:true,
      headers: {
        'Accept': 'application/vnd.piaskownice.v2+json'
      } 
    }
  });
});