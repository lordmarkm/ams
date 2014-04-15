require([
  'angular',
  'angular-ui-router',
  'angular-resource',
  'angular-ui-bootstrap',
  'angular-toaster',
  'properties/properties.module'
], function (angular) {

  angular.element().ready(function () {

    angular.module('init', ['config.module', 'common.module'])
      .config(['$stateProvider', function ($stateProvider) {
        $stateProvider.state('dashboard', {
          url: '/'
        });
      }]);

    angular.bootstrap(document, [
      'ui.router',
      'ngResource',
      'ui.bootstrap',
      'init'
    ]);
  });
});
