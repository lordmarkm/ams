require([
  'angular',
  'angular-ui-router',
  'angular-resource',
  'angular-animate',
  'angular-ui-bootstrap',
  'angular-ui-select2',
  'block-ui',
  'angular-toaster',
  'ng-table',
  'ui-scrollfix',
  'sugar',
  'autofill',
  'select2'
], function (angular) {

  angular.element().ready(function () {

    angular.bootstrap(document, [
      'ui.router',
      'ngResource',
      'ngAnimate',
      'ui.bootstrap',
      'ui.select2',
      'ngTable',
      'ui.scrollfix'
    ]);

  });

});
