<%-- 
    Document   : index
    Created on : 07-05-2013, 11:26:57
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
<!--  <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">-->
  <title></title>
<!--  <link rel="stylesheet" href="https://d10ajoocuyu32n.cloudfront.net/mobile/1.3.1/jquery.mobile-1.3.1.min.css">
  
   jQuery and jQuery Mobile 
  <script src="https://d10ajoocuyu32n.cloudfront.net/jquery-1.9.1.min.js"></script>
  <script src="https://d10ajoocuyu32n.cloudfront.net/mobile/1.3.1/jquery.mobile-1.3.1.min.js"></script>

   Extra Codiqa features 
  <script src="https://d10ajoocuyu32n.cloudfront.net/codiqa.ext.js"></script>-->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"> </script>
  <script>
      $(function(){
          $("#findBtn").click(function(){
              var nr = $("#nr").val();
              alert(nr);
              $.ajax({
                  url: "http://localhost:8080/WebServiceWannabeKrak/resources/dk.cphbusiness.services.persondata/Phone/" + nr,
                  datatype: "json",
                  success: displayInfo
              });
          });
          
          function displayInfo(data){
              alert(JSON.stringify(data));
              $("#firstName").val(data.firstName);
              $("#lastName").val(data.lastName);
              $("#street").val(data.street);
              $("#city").val(data.city);
              $("#zipcode").val(data.zipcode);
          }
      });
  </script>
   
</head>
<body>
<!-- Home -->
<div data-role="page" id="page1">
    <div data-role="content">
        <div class="ui-grid-a">
            <div class="ui-block-a">
                <div data-role="fieldcontain">
                    <label for="textinput1">
                        Find by phone
                    </label>
                    <input name="" id="nr" placeholder="Phonenumber" value="" type="text">
                </div>
            </div>
            <div class="ui-block-b">
                <button type="button"  id="findBtn">
                    Find
                </button>
            </div>
        </div>
        <div data-role="fieldcontain">
            <label for="firstName">
                First name
            </label>
            <input name="" id="firstName" placeholder="" value="" type="text">
        </div>
        <div data-role="fieldcontain">
            <label for="lastName">
                Last name
            </label>
            <input name="" id="lastName" placeholder="" value="" type="text">
        </div>
        <div data-role="fieldcontain">
            <label for="street">
                Street
            </label>
            <input name="" id="street" placeholder="" value="" type="text">
        </div>
        <div data-role="fieldcontain">
            <label for="city">
                City
            </label>
            <input name="" id="city" placeholder="" value="" type="text">
        </div>
        <div data-role="fieldcontain">
            <label for="zipcode">
                Zipcode
            </label>
            <input name="" id="zipcode" placeholder="" value="" type="text">
        </div>
    </div>
</div>
</body>
</html>
