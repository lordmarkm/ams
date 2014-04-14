<#import "/spring.ftl" as spring />

<!DOCTYPE html>
<html>

<head>
<title>Register</title>
<link rel="stylesheet"
  href="/libs/bootstrap-3.0.3/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/app.css" />
<script type="text/javascript"
  src="/libs/bootstrap-3.0.3/js/bootstrap.min.js"></script>
</head>
</head>
<body>

<div class="container">
  <div class="center-block" style="width: 40%; vertical-align: middle;">
    <form class="form" action="/auth/register" method="post">
      <div class="form-group">
        <label class="control-label" for="username">Username</label> 
        <input type="text" name="username" id="username" class="form-control" />
      </div>
      <div class="form-group">
        <label class="control-label" for="password">Password</label> 
        <input type="password" name="password" id="password" class="form-control" />
      </div>
      <div class="form-group">
        <label class="control-label" for="confirmpw">Confirm Password</label>
        <input type="password" name="confirmpw" id="confirmpw" class="form-control" />
      </div>
      <div class="form-group">
        <input class="btn btn-success btn-large" type="submit" value="Sign Up" />
      </div>
    </form>
  
    <div>Already have an account? <a href="/auth/login">Login</a></div>
  </div>
</div>

</body>

</html>