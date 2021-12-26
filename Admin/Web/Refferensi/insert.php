<!---- Insert -->
<?php
echo "Data Ditambahkan ".$_POST['nama'];
include("connect.php");



$id = $_POST['id'];
$nama = $_POST['nama'];
$callsign = $_POST['callsign'];
$angkatan = $_POST['angkatan'];
$jk = $_POST['jk'];
$goldar = $_POST['goldar'];
//$nodarurat = $_POST['nodarurat'];

$query = "INSERT INTO anggota VALUES ('$id','$nama','$callsign','$angkatan','$jk','$goldar'/*,'$nodarurat'*/)";
mysqli_query($connectdb,$query) or exit ("Query Error at<b>".$query."</b>");

include("home.php");
?>
