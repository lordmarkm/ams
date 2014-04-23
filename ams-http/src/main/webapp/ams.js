require.config({
  paths: {
    'domReady': '/libs/require/domReady',
    'angular':  '/libs/angular/angular.min',
    "uiRouter": '/libs/angular/angular-ui-router.min',
    'moment' : '/libs/backups/moment.min'
  },
  shim: {
    'angular': {
      exports: 'angular'
    },
    'uiRouter':{
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