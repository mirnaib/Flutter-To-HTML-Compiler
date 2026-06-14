<?php
if(isset($_GET['submit'])) {
   $submit = $_GET['submit'];

      if ($submit == 1) {
          // Redirect to another page
          header("Location: Details.html");
          exit();
      }


    }
if(isset($_GET['submit'])) {
   $submit = $_GET['submit'];

      if ($submit == 2) {
          // Redirect to another page
          header("Location: Details_2.html");
          exit();
      }


    }
if(isset($_GET['submit'])) {
   $submit = $_GET['submit'];

      if ($submit == 3) {
          // Redirect to another page
          header("Location: Details_3.html");
          exit();
      }


    }?>
 <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<style>
.container {
    text-align: center;
}
</style>

<body> 
<div class="container">
<br>
 <a href="?submit=1"><div class="row"><br>
            <div class="col"> <img height="100%" width="50%"
                        src="https://cdn.salla.sa/AZDzq/fDN9X6mX9EMv0Jh6EOVSdhS8G8Sr6FbvCUi7WOVQ.jpg",
                   alt=""></div>

</div></a>
 <a href="?submit=2"><div class="row"><br>
            <div class="col"> <img height="100%" width="50%"
                        src="https://png.pngtree.com/png-clipart/20210606/original/pngtree-3d-beauty-cosmetics-product-design-png-image_6391024.jpg",
                   alt=""></div>

</div></a>
 <a href="?submit=3"><div class="row"><br>
            <div class="col"> <img height="100%" width="50%"
                        src="https://watermark.lovepik.com/photo/20211202/large/lovepik-skin-care-products-cosmetics-set-white-background-picture_501396574.jpg",
                   alt=""></div>

</div></a></div>
<br><br></body>

</html>