<?php 

if (session_status() === PHP_SESSION_NONE) {
    session_start();
}

if(isset($_SESSION['Id']) && isset($_SESSION['Nama'])){
    include("connect.php");

    if(isset ($_POST['KodeOrder'])){
        $KodeOrder =  $_POST['KodeOrder'];
        $stmt = $conn->prepare("UPDATE orders
                            SET Status_order = 'Selesai'
                            WHERE Kode_order = '".$KodeOrder."'");
        $stmt->execute();

        $stmt = $conn->prepare ("SELECT COUNT(Status_order) FROM orders WHERE Status_order= 'Disiapkan'");
        $stmt->execute();
        $stmt->store_result();
        if($stmt->num_rows > 0){
            $stmt->bind_result($colspan);
            $stmt->fetch();                                   
        }
        $_SESSION['lastcount'] = $colspan;

        header("Location: a.php");
        exit();
    }
    else {
        header("Location: a.php");
        exit();
    }
    

}
else {
    echo "<script>alert('Session Telah Berakhir silahkan login kembali')</script>";
    header("Location: login.php");
}


?>