<?php 

session_start();
if(isset($_SESSION['Id']) && isset($_SESSION['Nama'])){
    $KodeOrder =  $_POST['KodeOrder'];
    $stmt = $conn->prepare("UPDATE orders
                        SET Status_order = 'Selesai'
                        WHERE Kode_order = '".$KodeOrder."'");
    $stmt->execute();
    include("a2.php");

}
else {
    echo "<script>alert('Session Telah Berakhir silahkan login kembali')</script>";
    header("Location: login.php");
}

include("connect.php");




?>