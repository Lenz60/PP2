<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- CSS -->
    <link rel="stylesheet" href="style.css">
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">    
    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script> 
    <title>Admin Pesan Palgading</title>
    
</head>

<?php 
if (session_status() === PHP_SESSION_NONE) {
    session_start();
}
if(isset($_SESSION['Id']) && isset($_SESSION['Nama'])){
    ?>
<body class="bg">
    <div class="container-fluid">
        <div class="row flex-nowrap">
            <div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-dark" style="height: auto;">
                <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
                    <a href="/" class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none">
                        <span class="fs-5 d-none d-sm-inline"><?php print "Selamat Datang\n".$_SESSION['Nama'] ?></span>
                    </a>   
                    <ul class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start" id="menu">
                        <li class="nav-item">
                            <span id="clock"></span>
                        </li>
                        <li class="nav-item">
                            <a href="a.php" class="nav-link align-middle px-0">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-stop-circle" viewBox="0 0 16 16">
                            <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                            <path d="M5 6.5A1.5 1.5 0 0 1 6.5 5h3A1.5 1.5 0 0 1 11 6.5v3A1.5 1.5 0 0 1 9.5 11h-3A1.5 1.5 0 0 1 5 9.5v-3z"/>
                            </svg> <span class="ms-1 d-none d-sm-inline">Resume Refresh</span>
                            </a>
                        </li>
                    </ul>
                    <hr>
                        <div class="dropdown pb-4">
                            <a href="#" class="d-flex align-items-center text-white text-decoration-none dropdown-toggle" id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
                                <img src="user.svg" alt="hugenerd" width="30" height="30" class="rounded-circle">
                                <span class="d-none d-sm-inline mx-1"><?php print $_SESSION['Nama'] ?></span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-dark text-small shadow">
                                <li>
                                    <a class="dropdown-item" href="logout.php" >Logout</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col py-3">
                    <!-- Incoming Table -->
                    <div class="row align-items-center" style="margin-left: 10px; max-width: 50%;">
                        <table class="table table-bordered border-dark">
                            <?php 
                            include("connect.php");
                            $notable = 0;
                            ?>
                            <tr>
                                <?php 
                                    
                                    $stmt = $conn->prepare ("SELECT COUNT(Status_order) FROM orders WHERE Status_order= 'Disiapkan'");
                                    $stmt->execute();
                                    $stmt->store_result();
                                    if($stmt->num_rows > 0){
                                        $stmt->bind_result($colspan);
                                        $stmt->fetch();
                                        ?> <th class="table-dark text-center" colspan=<?php print $colspan ?>>Pesanan Baru</th>
                                        <?php
                                    }

                                    if (!isset($_SESSION['lastcount'])){
                                        $check = $_SESSION['lastcount'] = $colspan;
                                    }
                                    else {
                                        $check = $_SESSION['lastcount'];
                                    }
                                    
                                    if($colspan > $check){
                                        $check = $_SESSION['lastcount'] = $colspan;
                                        ?>
                                        <iframe src="notification.mp3" allow="autoplay" style="display:none" id="iframeAudio"></iframe> 
                                        <audio id="player" autoplay loop><source src="notification.mp3" type="audio/mp3"></audio>
                                    
                                        <?php
                                    }
                                    else {
                                        
                                    }

                                ?>
                                
                            </tr>
                            <tr style="background-color: green;">
                                <?php
                                    $stmt = $conn->prepare ("SELECT g.No_meja, p.Kategori_produk FROM orders o 
                                                                                    JOIN guest_order gord ON o.Kode_Guest_Order = gord.Kode_guest_order 
                                                                                    JOIN guest g ON gord.Kode_Meja = g.Kode_meja 
                                                                                    JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order 
                                                                                    JOIN product p ON po.Kode_Produk = p.Kode_produk 
                                                                                    JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order 
                                                                                    JOIN topping t ON tord.Kode_Topping = t.Kode_topping 
                                                            WHERE o.Status_order = 'Disiapkan' GROUP BY o.Kode_order ORDER BY gord.Kode_Guest_Order DESC");
                                    $stmt->execute();
                                    $resultIncomingOrder = $stmt->get_result();
                                    while ($rowIncoming = $resultIncomingOrder -> fetch_array(MYSQLI_ASSOC)){
                                        ?>
                                        <td class="sizetables3">
                                            <form method="POST" action="a2.php" class="hiddenform">
                                                <input type="hidden" name="notable" value=<?php print $rowIncoming["No_meja"] ?>>
                                                <button type="submit" name="notable" value=<?php print $rowIncoming["No_meja"] ?> class="link-button">
                                                    <?php print $rowIncoming["No_meja"] ?> 
                                                    <br> 
                                                    <?php print $rowIncoming["Kategori_produk"] ?>
                                                </button>
                                            </form>
                                            
                                        </td>
                                    <?php }
                                    ?>
                            </tr>
                        </table>
                    </div>
                    
                    <!-- Table Location -->
                    <div class="row align-items-center" style="margin-left: 50px;">
                        <table class="table table-bordered border-dark" style="max-width: 500px; background-color:white">
                            <!--  //| Lokasi Meja  -->
                            <!-- //* If Nomor Meja is clicked then show the Select Order on the next Table -->
                            <tr>
                            
                                <th class="table-dark text-center" colspan="5" scope="colgroup" >Lokasi Meja</th>
                            </tr>
                            <tr>
                                <?php 
                                    
                                    //* Incoming Order set Color
                                    $table1Status = "white";
                                    $table2Status = "white";
                                    $table3Status = "white";
                                    $table4Status = "white";
                                    $table6Status = "white";
                                    $table7Status = "white";
                                    $table9Status = "white";
                                    $table10Status = "white";
                                    $table11Status = "white";
                                    $table12Status = "white";
                                    $table13Status = "white";
                                    
                                    // Display Ordered Table as green
                                    $stmt = $conn->prepare ("SELECT g.No_meja 
                                                            FROM orders o JOIN guest_order gord ON o.Kode_Guest_Order = gord.Kode_guest_order JOIN guest g ON gord.Kode_Meja = g.Kode_meja
                                                                            JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order
                                                                            JOIN product p ON po.Kode_Produk = p.Kode_produk
                                                                            JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order
                                                                            JOIN topping t ON tord.Kode_Topping = t.Kode_topping
                                                            WHERE o.Status_order = 'Disiapkan' GROUP BY o.Kode_order ORDER BY gord.Kode_Guest_Order DESC;");
                                    $stmt->execute();
                                    $resultTableColor = $stmt -> get_result();
                                    while ($RowTable = $resultTableColor -> fetch_array(MYSQLI_ASSOC)){
                                        
                                        if ($RowTable['No_meja'] == "1"){
                                            $table1Status = "green";
                                        }
                                        else if($RowTable['No_meja'] == "2"){
                                            $table2Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "3"){
                                            $table3Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "4"){
                                            $table4Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "5"){
                                            $table6Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "6"){
                                            $table6Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "7"){
                                            $table7Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "8"){
                                            $table9Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "9"){
                                            $table9Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "10"){
                                            $table10Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "11"){
                                            $table11Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "12"){
                                            $table12Status = "green";
                                        }
                                        else if ($RowTable['No_meja'] == "13"){
                                            $table13Status = "green";
                                        }
                                        else {
                                            
                                        }
                                    }
                                ?>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td colspan="2" class="sizetables1" style="background-color: <?php echo $table1Status ?>;" >
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="1">
                                            <button type="submit" name="notable" value="1" class="link-button">1</button>
                                        </form>
                                    </td>
                                    <td style="background-color: white;"></td>
                                </tr>

                                <tr>
                                    <td></td>
                                    <td class="sizetables1" style="background-color: <?php echo $table10Status ?>;">
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="10">
                                            <button type="submit" name="notable" value="10" class="link-button">10</button>
                                        </form>
                                    </td>
                                    <td class="sizetables2" rowspan="2" style="background-color: <?php echo $table9Status ?>;">
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="9">
                                            <button type="submit" name="notable" value="9" class="link-button">8/9</button>
                                        </form>
                                    </td>
                                    <td class="sizetables2" rowspan="2" style="background-color: <?php echo $table6Status ?>;">
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="6">
                                            <button type="submit" name="notable" value="6" class="link-button">5/6</button>
                                        </form>
                                    </td>
                                    <td class="sizetables1" style="background-color: <?php echo $table2Status ?>;">
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="2">
                                            <button type="submit" name="notable" value="2" class="link-button">2</button>
                                        </form>
                                    </td>
                                </tr>
                                
                                <tr class="sizetables1">
                                    <td class="sizetables2" style="background-color: <?php echo $table13Status ?>;" rowspan="2" >
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="13">
                                            <button type="submit" name="notable" value="13" class="link-button">13</button>
                                        </form>
                                    </td>
                                    <td style="padding-top: 20px;background-color: <?php echo $table11Status ?>;">
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="11">
                                            <button type="submit" name="notable" value="11" class="link-button">11</button>
                                        </form>
                                    </td>
                                    <td style="padding-top: 20px;background-color: <?php echo $table3Status ?>;">
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="3">
                                            <button type="submit" name="notable" value="3" class="link-button">3</button>
                                        </form>
                                    </td>
                                    
                                    
                                </tr>

                                <tr class="sizetables1">
                                    <td style="padding-top: 20px;background-color: <?php echo $table12Status ?>;">
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="12">
                                            <button type="submit" name="notable" value="12" class="link-button">12</button>
                                        </form>
                                    </td>
                                    <td style="background-color: white;"></td>
                                    <td style="padding-top: 20px;background-color: <?php echo $table7Status ?>;">
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="7">
                                            <button type="submit" name="notable" value="7" class="link-button">7</button>
                                        </form>
                                    </td>
                                    <td style="padding-top: 20px;background-color: <?php echo $table4Status ?>;">
                                        <form method="POST" action="a2.php" class="hiddenform">
                                            <input type="hidden" name="notable" value="4">
                                            <button type="submit" name="notable" value="4" class="link-button">4</button>
                                        </form>
                                    </td>
                                </tr>
                            </tr>
                        </table>
                        
                    </div>
                    <!-- End of Table Meja -->
                    <!-- Table Detail Order -->
                    <div class="row">
                        <!-- Table Detail Order -->
                        <div class="table-responsive">
                            <table class="table table-bordered border-dark table-striped table-hover text-center" style="width: 1000px; background-color:white">
                                <tr>
                                    <?php
                                        include("connect.php");
                                    ?>
                                    <th class="table-dark" colspan="10">Detail Order</th>
                                    <tr>
                                        <th>Lokasi</th>
                                        <th>Jumlah Pesanan</th>
                                        <th>Nama Makanan</th>
                                        <th>Tipe Makanan</th>
                                        <th>Topping</th>
                                        <th>Total Bayar</th>
                                        <th>Status</th>
                                        <th>Konfirmasi Pesanan</th>
                                    </tr>
                                    <tr>
                                        <?php 
                                            if (isset ($_POST['notable']) == null ){
                                            }
                                            else {
                                                $stmt = $conn->prepare("SELECT g.No_meja,po.Jumlah_Produk_PO, o.Kode_order,p.Nama_produk,p.Tipe_produk, t.Nama_topping, (p.Harga_produk*po.Jumlah_Produk_PO) + SUM(t.Harga_topping) AS 'Total Bayar', o.Status_order 
                                                                        FROM orders o JOIN guest_order gord ON o.Kode_Guest_Order = gord.Kode_guest_order JOIN guest g ON gord.Kode_Meja = g.Kode_meja
                                                                                                JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order
                                                                                                JOIN product p ON po.Kode_Produk = p.Kode_produk
                                                                                                JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order
                                                                                                JOIN topping t ON tord.Kode_Topping = t.Kode_topping
                                                                        WHERE g.No_meja = '".$_POST['notable']."' AND o.Status_order = 'Disiapkan' GROUP BY o.Kode_order ORDER BY gord.Kode_guest_order DESC;");
                                                $stmt->execute();
                                                
                                                $resultDetailOrder = $stmt->get_result();
                                                while ($rowDetail = $resultDetailOrder -> fetch_array(MYSQLI_ASSOC)){
                                                    ?>
                                                    <tbody>
                                                    <?php
                                                        //* Count the Topping name for span
                                                        $stmt = $conn->prepare ("SELECT COUNT(t.Nama_topping) FROM orders o 
                                                                                                                JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order 
                                                                                                                JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order 
                                                                                                                JOIN topping t ON tord.Kode_Topping = t.Kode_topping WHERE o.Kode_order = '".$rowDetail['Kode_order']."'");
                                                        $stmt->execute();
                                                        $stmt->store_result();
                                                        if($stmt->num_rows > 0){
                                                            $stmt->bind_result($rowspanStats);
                                                            $stmt->fetch();
                                                        }
                                                        ?>
                                                        <?php
                                                        $stmt = $conn->prepare("SELECT t.Nama_topping FROM orders o JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order 
                                                                                                        JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order
                                                                                                        JOIN topping t ON tord.Kode_Topping = t.Kode_topping
                                                                                WHERE o.Kode_order = '".$rowDetail["Kode_order"]."' AND o.Status_order = 'Disiapkan'");
                                                        $stmt->execute();
                                                        ?>
                                                        <tr>
                                                            <td rowspan="<?php print $rowspanStats?>">Meja <?php print $rowDetail["No_meja"] ?></td> <!-- //? Fill with Order Data// -->
                                                            <td rowspan="<?php print $rowspanStats?>"><?php print $rowDetail["Jumlah_Produk_PO"] ?></td> <!-- //? Fill with Order Data// -->
                                                            <td rowspan="<?php print $rowspanStats?>"><?php print $rowDetail["Nama_produk"] ?></td>
                                                            <td rowspan="<?php print $rowspanStats?>"><?php print $rowDetail["Tipe_produk"] ?></td>    
                                                            <?php
                                                            $resultTopping = $stmt->get_result();
                                                            ?>
                                                            <td rowspan="<?php print $rowspanStats?>">
                                                                <table class="text-center">
                                                                    <?php          
                                                                    while ($rowTopping = $resultTopping -> fetch_array(MYSQLI_ASSOC)){
                                                                        ?>
                                                                        <tr>
                                                                            <td>
                                                                                <?php print $rowTopping["Nama_topping"] ?>
                                                                            </td> 
                                                                        </tr>                                                                                                                                       
                                                                    <?php
                                                                    }
                                                                    ?>                                                               
                                                                </table>
                                                            </td>
                                                            <?php
                                                            $stmt = $conn->prepare("SELECT g.No_meja, o.Kode_order,p.Nama_produk,p.Tipe_produk, t.Nama_topping, (p.Harga_produk*po.Jumlah_Produk_PO) + SUM(t.Harga_topping) AS 'Total Bayar', o.Status_order 
                                                                FROM orders o JOIN guest_order gord ON o.Kode_Guest_Order = gord.Kode_guest_order JOIN guest g ON gord.Kode_Meja = g.Kode_meja
                                                                                JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order
                                                                                JOIN product p ON po.Kode_Produk = p.Kode_produk
                                                                                JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order
                                                                                JOIN topping t ON tord.Kode_Topping = t.Kode_topping
                                                                WHERE g.No_meja = '".$_POST['notable']."' AND o.Status_order = 'Disiapkan' GROUP BY o.Kode_order;");
                                                            $stmt->execute();
                                                            $resultStatsOrder = $stmt->get_result();
                                                            $rowStats = $resultStatsOrder -> fetch_array(MYSQLI_ASSOC);
                                                            ?>
                                                            <td rowspan="<?php print $rowspanStats?>">Rp <?php print $rowStats["Total Bayar"] ?></td>
                                            
                                                            <td rowspan="<?php print $rowspanStats?>"><?php print $rowStats["Status_order"] ?></td>
                                                            <td rowspan="<?php print $rowspanStats?>">
                                                                <form method="POST" action="dibuat.php" class="hiddenform">
                                                                    <input type="hidden" name="Status" value="Selesai">
                                                                    <input type="hidden" name="KodeOrder" value="<?php print $rowStats['Kode_order'] ?>">
                                                                    <button type="submit" name="Button" value="Selesai" class="statusorderbutton">Selesai</button>
                                                                </form>
                                                            </td>
                                                        </tr>
                                                    </tbody>
                                                <?php }
                                            }
                                            ?>
                                    </tr>
                                </tr>
                            </table>
                        </div>
                    </div>     
                </div>      
            </div>
        </div>
    </div>
</body>
    <?php
 }
 else {
    echo "<script>alert('Session Telah Berakhir silahkan login kembali')</script>";
    header("Location: login.php");
 }


?>

<script type="text/javascript">
    var clockElement = document.getElementById('clock');
    var options = {hour:"numeric", minute:"numeric", second:"2-digit", weekday: 'long', year: 'numeric', month: 'long', day: 'numeric'};
    var today = new Date();

    function clock() {
        clockElement.textContent = today.toLocaleDateString("id-ID",options).toString();
    }

    setInterval(clock, 10);
</script>



</html>

