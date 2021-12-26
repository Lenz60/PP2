<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Input Keanggotaan GAS</title>
</head>

<body>
    <table>
        <tr>
            <td>
                <fieldset>
                    <legend>Insert Data Anggota</legend>
                    <form action="insert.php" method="POST">
                        ID :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                        <input type="text" name="id" id="idid" />
                        <br>
                        Nama :&ensp;&ensp;&ensp;&nbsp;
                        <input type="text" name="nama" id="idnama" />
                        <br>
                        Callsign :&ensp;
                        <input type="text" name="callsign" id="idcallsign" />
                        <br>
                        Angkatan :&ensp;&ensp;&nbsp;
                        <br>
                        <input type="text" name="angkatan" id="idangkatan" />
                        <br>
                        Jenis Kelamin :&ensp;&ensp;&nbsp;
                        <br>
                        <select name="jk" id="idjk">
                            <option value="PRIA">PRIA</option>
                            <option value="WANITA">WANITA</option>
                        </select>
                        <br>
                        Gol Darah :
                        <select name="goldar" id="idgoldar">
                            <option value="A+">A+</option>
                            <option value="A-">A-</option>
                            <option value="B+">B+</option>
                            <option value="B-">B-</option>
                            <option value="AB+">AB+</option>
                            <option value="AB-">AB-</option>
                            <option value="O+">O+</option>
                            <option value="O-">O-</option>
                        </select>
                        <br>
                        <!--- Nomor Darurat : &ensp;
                        <br>
                        <input type="text" name="nodarurat" id="idnodarurat" />
                        <br>
                        --->
                        <input type="submit" value="Add" />
                    </form>
                </fieldset>
                <br>
                <fieldset>
                    <legend>Update Data Anggota</legend>
                    <form action="update.php" method="POST">
                    ID :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                        <input type="text" name="id" id="idid" />
                        <br>
                        Nama :&ensp;&ensp;&ensp;&nbsp;
                        <input type="text" name="nama" id="idnama" />
                        <br>
                        Callsign :&ensp;
                        <input type="text" name="callsign" id="idcallsign" />
                        <br>
                        Angkatan :&ensp;&ensp;&nbsp;
                        <br>
                        <input type="text" name="angkatan" id="idangkatan" />
                        <br>
                        Jenis Kelamin :&ensp;&ensp;&nbsp;
                        <br>
                        <select name="jk" id="idjk">
                            <option value="PRIA">PRIA</option>
                            <option value="WANITA">WANITA</option>
                        </select>
                        <br>
                        Gol Darah :
                        <select name="goldar" id="idgoldar">
                            <option value="A+">A+</option>
                            <option value="A-">A-</option>
                            <option value="B+">B+</option>
                            <option value="B-">B-</option>
                            <option value="AB+">AB+</option>
                            <option value="AB-">AB-</option>
                            <option value="O+">O+</option>
                            <option value="O-">O-</option>
                        </select>
                        <br>
                        <!--- Nomor Darurat : &ensp;
                        <br>
                        <input type="text" name="nodarurat" id="idnodarurat" />
                        <br>
                        --->
                        <input type="submit" value="Update" />
                    </form>
                </fieldset>
                <br>
                <fieldset>
                    <legend>Delete Data Anggota</legend>
                    <form action="delete.php" method="POST">
                        ID :&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                        <input type="text" name="id" id="idid" />
                        <br>
                        <input type="submit" value="Delete" />
                    </form>
                </fieldset>
            </td>
            <td>
            <form action="home.php" style="padding-left : 30%;">
                    <input type="submit" value="Refresh Table" />
                </form>
                <div style="height:500px;overflow:auto;">
                    <table border="1px">
                    <?php
                    include("connect.php");
                    $query = "Select * FROM anggota";
                    $hasil = mysqli_query($connectdb, $query) or exit("Query error at <b>" . $query . "</b>.");
                    ?>
                    <thead>
                        <tr>
                            <td>Id</td>
                            <td>Nama</td>
                            <td>CallSign</td>
                            <td>Angkatan</td>
                            <td>Jenis Kelamin</td>
                            <td>Golongan Darah</td>
                            <!--- <td>No_darurat</td> -->
                        </tr>
                    </thead>
                    <?php
                    while ($data = mysqli_fetch_assoc($hasil)) { ?>
                    <tbody>
                        <tr>
                            <td align="center">
                            <?php echo $data['Id']; ?></td>
                            <td><?php echo $data['Nama']; ?></td>
                            <td><?php echo $data['Callsign']; ?></td>
                            <td><?php echo $data['Angkatan']; ?></td>
                            <td><?php echo $data['Jenis_kelamin']; ?></td>
                            <td><?php echo $data['Golongan_darah']; ?></td>
                            <!---<td><?php echo $data['No_darurat']; ?></td>
                            --->
                        </tr>
                    </tbody>
                    <?php
                    }
                    ?>
                    </table>
                </div>
            </td>
        </tr>
    </table>
</body>

</html>