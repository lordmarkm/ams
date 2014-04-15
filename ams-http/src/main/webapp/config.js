require.config({
  baseUrl: '${basedir}/src/main/webapp',
  paths: {
    'angular': 'libs/angular/angular',
    'angular-ui-router': 'libs/angular/angular-ui-router',
    'angular-resource': 'libs/angular/angular-resource',
    'angular-animate': 'libs/angular/angular-animate',
    'angular-ui-bootstrap': 'libs/angular/ui-bootstrap-tpls-0.10.0',
    'block-ui': 'libs/angular/angular-block-ui',
    'angular-ui-select2': 'libs/angular/angular-ui-select2',
    'angular-toaster': 'libs/angular/angular-toaster',
    'ng-table': 'libs/angular/ng-table-0.3.2',
    'ui-scrollfix': 'libs/angular/scrollfix',
    'jquery': 'libs/jquery/jquery-1.10.2',
    'underscore': 'libs/underscore',
    'autofill': 'libs/autofill-event',
    'sugar': 'libs/sugar',
    'select2': 'libs/select2'
  },
  shim: {
    'angular': {
      exports: 'angular',
      deps: ['jquery']
    },
    'angular-ui-router': {
      deps: ['angular']
    },
    'angular-resource': {
      deps: ['angular']
    },
    'angular-animate': {
      deps: ['angular']
    },
    'angular-ui-bootstrap': {
      deps: ['angular']
    },
    'block-ui': {
      deps: ['angular']
    },
    'angular-toaster': {
      deps: ['angular', 'angular-animate']
    },
    'ng-table': {
      deps: ['angular']
    },
    'ui-scrollfix': {
      deps: ['angular']
    },
    'autofill': {
      deps: ['angular']
    },
    'jquery': {
      exports: 'jquery'
    },
    'underscore': {
      exports: 'underscore'
    },
    'sugar': {
      exports: 'sugar'
    }
  },
  dir: "${basedir}/target/webapp-build",
  modules: [
    {
      name: "ams"
    },
    {
      name: "properties/properties.module"
    }
  ]
});
