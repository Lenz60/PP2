<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <!-- Bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">    
        <!-- Bootstrap JS -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>    
        <title>Admin Pesan Palgading</title>
        <title>Login Admin Pesan Palgading</title>
    </head>
    <body class="d-flex justify-content-center">

        <?php
        session_start();
        include("connect.php");
        if(isset($_SESSION['Id']) && isset($_SESSION['Nama'])){
            header("Location: a.php");
        
        }
        else {
            ?> 
            <div class="d-flex align-items-center" >
                <fieldset class="border border-dark loginPadding" >
                    <form action="login.php" method="POST">
                        <label class="form-label">Username</label>
                        <br>
                        <input class="form-control" type="text" name="Username" id="idUsername" 
                        required minlength="2" maxlength="6">
                        <br>
                        <label class="form-label">Password</label>
                        <br>
                        <input class="form-control" type="password" name="Password" id="idPassword"
                        required minlength="2" maxlength="12">
                        <br>
                        <button type="submit" class="btn btn-outline-primary d-grid gap-2 col-6 mx-auto" name="loginBtn">Login</button>
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
                </fieldset>
            </div>
            
        <?php 
        }
        ?>
        
    </body>
</html>