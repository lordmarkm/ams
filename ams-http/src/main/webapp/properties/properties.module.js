require([
  'angular',
  'angular-ui-router',
  'angular-resource'
], function (angular) {

  angular.element().ready(function () {

    angular.bootstrap(document, [
      'ui.router',
      'ngResource'
    ]);

  });

});
