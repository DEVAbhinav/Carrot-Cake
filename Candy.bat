<!-- :
:: textSubmitter.bat
@echo off

for /f "tokens=* delims=" %%p in ('mshta.exe "%~f0"') do (
    set "choice=%%p"
)
if %choice%==codeChef (
explorer D:\Abhinav\Projects\carrot-cake\CodeChef
@rem d:
@rem cd D:\Abhinav\Projects\carrot-cake\CodeChef
start cmd.exe D:\Abhinav\Projects\carrot-cake\CodeChef
)

if %choice%==fantasy (
explorer D:\Abhinav\Projects\3rd yr\fantasy

start cmd.exe D:\Abhinav\Projects\3rd yr\fantasy
)

if %choice%==scrapeAmazon (
explorer D:\Abhinav\Projects\3rd yr\scrapeAmazon

start cmd.exe D:\Abhinav\Projects\3rd yr\scrapeAmazon
)

echo your choice is %choice%
pause
exit /b
-->

<html>
<head><title>choice submitter</title></head>
<body>

    <script language='javascript' >
        function pipeText(pass) {
            var choice=pass.value;
            //console.log(pass);
            var fso= new ActiveXObject('Scripting.FileSystemObject').GetStandardStream(1);
            close(fso.Write(choice));

        }
    </script>

    <input type='button' name='codeChef' value= "codeChef" onClick="pipeText(this)"  size='15'></input>
    <hr>
    <input type='button' name='Fantasy' value= "fantasy"  onClick="pipeText(this)" size='15'></input>
    <hr>
    <input type='button' name='scrapeAmazon' value= "scrapeAmazon" onClick="pipeText(this)"  size='15'></input>
    
    <hr>
    

</body>
</html>