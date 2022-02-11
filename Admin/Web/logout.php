<?php
ob_start();
require("login.php");
session_unset();
session_destroy();
header("Location: login.php");
ob_end_flush();
exit();
?>