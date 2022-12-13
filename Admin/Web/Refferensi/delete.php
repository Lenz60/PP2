<!---- Delete -->
<?php
include("home.php");
include("connect.php");
$id = $_POST['id'];

$query = "DELETE FROM anggota WHERE id='".$id."'";

mysqli_query($connectdb,$query) or exit ("Error Query : <b>".$sql."</b>");
?>