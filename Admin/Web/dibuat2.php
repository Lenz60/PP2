<?php 
include("connect.php");


$KodeOrder =  $_POST['KodeOrder'];
$stmt = $conn->prepare("UPDATE orders
                        SET Status_order = 'Selesai'
                        WHERE Kode_order = '".$KodeOrder."'");
$stmt->execute();
include("a2.php");

?>