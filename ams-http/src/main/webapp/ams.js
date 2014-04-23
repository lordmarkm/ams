require.config({
  paths: {
    'domReady': '/libs/require/domReady',
    'angular':  '/libs/angular/angular.min',
    'uiRouter': '/libs/angular/angular-ui-router.min',
    'angular-resource': '/libs/angular/angular-resource',
    'moment' : '/libs/backups/moment.min'
  },
  shim: {
    'angular': {
      exports: 'angular'
    },
    'uiRouter':{
      deps: ['angular']
    },
    'angular-resource':{
      deps: ['angular']
    },
    'moment': {
      exports: 'moment'
    }
  },
  deps: [
   'bootstrap.js'
  ]
});