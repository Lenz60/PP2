<!---- Update -->
<?php
include("home.php");
include("connect.php");

$id = $_POST['id'];
$nama = $_POST['nama'];
$callsign = $_POST['callsign'];
$alamat = $_POST['alamat'];
$goldar = $_POST['goldar'];
$tgllahir = $_POST['tgllahir'];

$query = "UPDATE anggota SET Nama = '$nama', CallSign= '$callsign', Alamat = '$alamat', GolDarah = '$goldar', TglLahir = '$tgllahir' WHERE id = '$id'";
mysqli_query($connectdb,$query) or exit ("Error Query at <b>".$query."</b>");


?>