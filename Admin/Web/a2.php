<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="style.css">
    <title>Admin Pesan Palgading</title>
    
</head>

<body>
    <fieldset>
        <legend>Stop Auto Refresh</legend>
        <?php 
        if (isset($_POST['StopRefresh'])){
            
            ?>
            <form method="POST" action="a.php" class="hiddenform">
                <input type="hidden" name="ResumeRefresh" value="Stop">
                <button type="submit" name="ResumeRefresh" value="Stop" >Resume</button>
            </form>
            <?php
        }
        else{
            ?>
            <form method="POST" action="a.php" class="hiddenform">
                <input type="hidden" name="ResumeRefresh" value="Stop">
                <button type="submit" name="ResumeRefresh" value="Stop" >Resume</button>
            </form>
            <?php
        }
        ?>
    </fieldset>
    <!-- Incoming Table -->
    <div >
        <table border="1" style="width: 100%;">
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
                        ?> <th  colspan=<?php print $colspan ?>>Pesanan Baru</th>
                        <?php
                    }

                ?>
                
            </tr>
            <tr>
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
    <div class="row">
        <table border="1">
            <!--  //| Lokasi Meja  -->
            <!-- //* If Nomor Meja is clicked then show the Select Order on the next Table -->
            <tr>
                <th colspan="5" scope="colgroup">Lokasi Meja</th>
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
                        else if ($RowTable['No_meja'] == "6"){
                            $table6Status = "green";
                        }
                        else if ($RowTable['No_meja'] == "7"){
                            $table7Status = "green";
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
                    <td colspan="4" style="height: 50px; font-size:30px;" bgcolor="<?php echo $table1Status ?>" >
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="1">
                            <button type="submit" name="notable" value="1" class="link-button">1</button>
                        </form>
                    </td>
                </tr>

                <tr>
                    <td></td>
                    <td class="sizetables1" bgcolor="<?php echo $table10Status ?>">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="10">
                            <button type="submit" name="notable" value="10" class="link-button">10</button>
                        </form>
                    </td>
                    <td class="sizetables2" rowspan="2" bgcolor="<?php echo $table9Status ?>">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="9">
                            <button type="submit" name="notable" value="9" class="link-button">9</button>
                        </form>
                    </td>
                    <td class="sizetables2" rowspan="2" bgcolor="<?php echo $table6Status ?>">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="6">
                            <button type="submit" name="notable" value="6" class="link-button">6</button>
                        </form>
                    </td>
                    <td class="sizetables1" bgcolor="<?php echo $table2Status ?>">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="2">
                            <button type="submit" name="notable" value="2" class="link-button">2</button>
                        </form>
                    </td>
                
                <tr class="sizetables1">
                    <td bgcolor="<?php echo $table13Status ?>" rowspan="2" class="sizetables2">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="13">
                            <button type="submit" name="notable" value="13" class="link-button">13</button>
                        </form>
                    </td>
                    <td bgcolor="<?php echo $table11Status ?>">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="11">
                            <button type="submit" name="notable" value="11" class="link-button">11</button>
                        </form>
                    </td>
                    <td bgcolor="<?php echo $table3Status ?>">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="3">
                            <button type="submit" name="notable" value="3" class="link-button">3</button>
                        </form>
                    </td>
                    
                    
                </tr>

                <tr class="sizetables1">
                    <td bgcolor="<?php echo $table12Status ?>">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="12">
                            <button type="submit" name="notable" value="12" class="link-button">12</button>
                        </form>
                    </td>
                    <td></td>
                    <td bgcolor="<?php echo $table7Status ?>">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="7">
                            <button type="submit" name="notable" value="7" class="link-button">7</button>
                        </form>
                    </td>
                    <td bgcolor="<?php echo $table4Status ?>">
                        <form method="POST" action="a2.php" class="hiddenform">
                            <input type="hidden" name="notable" value="4">
                            <button type="submit" name="notable" value="4" class="link-button">4</button>
                        </form>
                    </td>
                </tr>
            </tr>
        </table>


        <div class="column">
            
        </div>
        
    </div>
    <!-- End of Table Meja -->
    <!-- Table Detail Order -->
    <div>
    <div class="row">
                <!-- Table Detail Order -->
                <div class="column">
                    <table border="1" style="text-align: center;">
                            <?php 
                            //! Query 1 HERE and Store to $OrderData
                            //! Use Passed No Table from HREF POST

                                //* Determine Colspan for how many topping of certain order
                                $a = 3; //* Topping
                                $a1 = $a+1;
                                //* Check Status
                                //! Get Status Value in  $OrderData
                                //* if (echo $OrderData['status'] == "Disiapkan"){
                                //*   $status = false; //HREF Dibuat Available
                                //* }
                                //* else {
                                //*    $status = true; //HREF Selesai Available
                                //* }
                                $status = false; 
                            ?>
                            
                            <tr>
                                <?php
                                    include("connect.php")

                                ?>
                                <th colspan="7">Detail Order</th>
                                <tr>
                                    <th>Pesanan</th>
                                    <th>Nama Makanan</th>
                                    <th>Tipe Makanan</th>
                                    <th>Topping</th>
                                </tr>
                                <tr>
                                    <?php 
                                        if (isset ($_POST['notable']) == null ){
                                            ?>
                                            <tr>
                                                <td rowspan="<?php echo $a ?>">Meja </td> <!-- //? Fill with Order Data// -->
                                            </tr>
                                            <!-- //? Fill with OrderCode Data// -->
                                                <!-- //! Use Query 1 and use Passed No Table from Href POST-->
                                                <td rowspan="<?php echo $a ?>">Nama Makanan</td>
                                                <!-- //? Fill with OrderCode Data// -->
                                                <!-- //! Use Query 1 and use Passed No Table from Href POST-->
                                                <td rowspan="<?php echo $a ?>">Tipe Makanan</td> 
                                                <!-- //? Fill with Topping Data// -->
                                                <!-- //! Use Query 2 and use the stored Kode order to use the WHERE Clause// -->
                                                <td>Topping1</td> 
                                                
                                            <?php
                                        }
                                        else {
                                            $stmt = $conn->prepare("SELECT g.No_meja, o.Kode_order,p.Nama_produk,p.Tipe_produk, t.Nama_topping, (p.Harga_produk*po.Jumlah_Produk_PO) + SUM(t.Harga_topping) AS 'Total Bayar', o.Status_order 
                                                                    FROM orders o JOIN guest_order gord ON o.Kode_Guest_Order = gord.Kode_guest_order JOIN guest g ON gord.Kode_Meja = g.Kode_meja
                                                                                            JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order
                                                                                            JOIN product p ON po.Kode_Produk = p.Kode_produk
                                                                                            JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order
                                                                                            JOIN topping t ON tord.Kode_Topping = t.Kode_topping
                                                                    WHERE g.No_meja = '".$_POST['notable']."' AND o.Status_order = 'Disiapkan' GROUP BY o.Kode_order;");
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
                                                        <td rowspan="<?php print $rowspanStats+1?>">Meja <?php print $rowDetail["No_meja"] ?></td> <!-- //? Fill with Order Data// -->
                                                        <td rowspan="<?php print $rowspanStats+1?>"><?php print $rowDetail["Nama_produk"] ?></td>
                                                        <td rowspan="<?php print $rowspanStats+1?>"><?php print $rowDetail["Tipe_produk"] ?></td>    
                                                    <?php
                                                    $resultTopping = $stmt->get_result();
                                                    while ($rowTopping = $resultTopping -> fetch_array(MYSQLI_ASSOC)){
                                                        
                                                        ?>
                                                        <tr>
                                                            <td><?php print $rowTopping["Nama_topping"] ?></td>
                                                        </tr>
                                                        <?php
                                                    }
                                                    ?>
                                                    </tr>
                                                </tbody>
                                            <?php }
                                            $lastSelectedTable = $_POST['notable'];

                                        }
                                        ?>
                                </tr>
                            </tr>
                    </table>
                </div>
                <!-- Table Status Order -->
                <div class="column">
                    <table border="1">
                        <th colspan="3">Status Order</th>
                        <tr>
                            <th>Total Bayar</th>
                            <th>Status</th>
                            <th>Konfirmasi Pesanan</th>
                        </tr>
                            <?php
                            if (isset($_POST['notable']) == null){
                                ?><tr>
                                    <td>Rp</td>
                                    <td>Status</td>
                                    <?php 
                                        if ($status == true) {
                                            //!Set Status to Selesai if this Clicked
                                            //!Static Query Here
                                            //!USE HREF POST
                                            ?><td><a href="google.com">Selesai</a></td>
                                            <?php
                                        }
                                        else {
                                            //!Set Status to Dibuat if this Clicked
                                            //!Static Query Here
                                            //!USE HREF POST
                                            ?><td><a href="google.com">Dibuat</a></td>
                                            <?php
                                        }
                                    ?>
                                </tr>
                                <?php

                            }
                            else {
                                $stmt = $conn->prepare("SELECT g.No_meja, o.Kode_order,p.Nama_produk,p.Tipe_produk, t.Nama_topping, (p.Harga_produk*po.Jumlah_Produk_PO) + SUM(t.Harga_topping) AS 'Total Bayar', o.Status_order 
                                                    FROM orders o JOIN guest_order gord ON o.Kode_Guest_Order = gord.Kode_guest_order JOIN guest g ON gord.Kode_Meja = g.Kode_meja
                                                                    JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order
                                                                    JOIN product p ON po.Kode_Produk = p.Kode_produk
                                                                    JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order
                                                                    JOIN topping t ON tord.Kode_Topping = t.Kode_topping
                                                    WHERE g.No_meja = '".$_POST['notable']."' AND o.Status_order = 'Disiapkan' GROUP BY o.Kode_order;");
                                $stmt->execute();
                                $resultStatsOrder = $stmt->get_result();
                                
                                while ($rowStats = $resultStatsOrder -> fetch_array(MYSQLI_ASSOC)){
                                    
                                ?><tr>
                                    <td rowspan="<?php print $rowspanStats+2?>">Rp <?php print $rowStats["Total Bayar"] ?></td>
                                    
                                    <td <?php print $rowspanStats+2?>><?php print $rowStats["Status_order"] ?></td>
                                    <td <?php print $rowspanStats+2?>>
                                        <form>
                                            <form method="POST" action="a.php" class="hiddenform">
                                                <input type="hidden" name="Status" value="Selesai">
                                                <button type="submit" name="Status" value="Selesai" class="statusorderbutton">Selesai</button>
                                            </form>
                                        </form>
                                        
                                        <?php
                                        if(isset($_POST['Status'])){
                                            $stmt = $conn->prepare("UPDATE orders
                                                                SET Status_order = 'Selesai'
                                                                WHERE Kode_order = '".$rowStats['Kode_order']."' LIMIT1");
                                            $stmt->execute();
                                        }
                                        ?>
                                    </td>
                                          
                                    <?php for($n = 0; $n < $rowspanStats+1; $n++){
                                                ?>
                                                <tr><td style="border: none;">&NonBreakingSpace;</td></tr>
                                                <?php
                                        }?>
                                <?php 
                                ?>
                                </tr>
                                <?php
                                
                                }
                            }
                            
                            ?>
                    </table>
                </div> 
        </div>     
    </div>
    


</body>




</html>

