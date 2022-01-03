<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <title>Login Admin Pesan Palgading</title>
    </head>
    <body>

        <?php
        session_start();
        include("connect.php");


        if(isset($_POST['StatusSession']) == null){

        }
        else{
            echo "Status Session telah selesai silahkan login lagi";
        }
        
        ?> 

        
        <fieldset>
            <form action="login.php" method="POST">
                <a>Username</a>
                <br>
                <input type="text" name="Username" id="idUsername" 
                required minlength="2" maxlength="6">
                <br>
                <a>Password</a>
                <br>
                <input type="password" name="Password" id="idPassword"
                required minlength="2" maxlength="12">
                <br>
                <button type="submit" name="loginBtn">Login</button>
            </form>
            

            <?php 
            if(isset($_POST['Username'])== null){
            }
            else {
                $stmt = $conn->prepare ("SELECT * FROM admin WHERE Username = '".$_POST['Username']."'");
                $stmt->execute();
                $stmt->store_result();
                if($stmt->num_rows > 0){
                    $stmt->bind_result($Id, $Username, $Password, $Nama);
                    $stmt->fetch();
                    if($Username == $_POST['Username'] && $Password == $_POST['Password']){
                        $_SESSION['Id'] = $Id;
                        $_SESSION['Username'] = $Username;
                        $_SESSION['Nama'] = $Nama;
                        header("Location:a.php");
                    }
                    else{
                    } 
                }
                $Message = "Username & Password Salah";
                echo "<script>alert('". $Message."')</script>";
            }
            ?>
        </fields>
        
    </body>
    
    

</html>