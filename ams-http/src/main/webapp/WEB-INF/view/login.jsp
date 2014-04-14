<#import "/spring.ftl" as spring />

<!DOCTYPE html>
<html>

<head>
<title>Login</title>
<link rel="stylesheet"
  href="/libs/bootstrap-3.0.3/css/bootstrap.min.css" />
<link rel="stylesheet"
  href="/css/app.css" />
<script type="text/javascript"
  src="/libs/bootstrap-3.0.3/js/bootstrap.min.js"></script>
</head>

<body>

  <div class="container">
    <div class="center-block" style="width: 40%; vertical-align: middle;">
      <#if error??>
        <div class="alert alert-danger">${error }</div>
      <#elseif message??>
        <div class="alert alert-info">${message }</div>
      </#if>

      <form class="form" action="/login/authenticate" method="post">
        <div class="form-group">
          <label class="control-label" for="username">Username</label> <input
            type="text" class="form-control" name="username"
            id="username" />
        </div>
        <div class="form-group">
          <label class="control-label" for="password">Password</label> 
          <input type="password" class="form-control" name="password" id="password" />
        </div>
        <div class="form-group">
          <input class="btn btn-primary" type="submit" value="Log in" />
        </div>
      </form>
      <p>
        No account? <a href="/auth/register">Sign up!</a>
      </p>
    </div>

  </div>
</body>

</html>
