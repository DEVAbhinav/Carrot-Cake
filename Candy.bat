<!-- :
:: textSubmitter.bat
@echo off
explorer D:\Abhinav\Projects\carrot-cake\CodeChef

@rem d:
@rem cd D:\Abhinav\Projects\carrot-cake\CodeChef
start cmd.exe D:\Abhinav\Projects\carrot-cake\CodeChef
for /f "tokens=* delims=" %%p in ('mshta.exe "%~f0"') do (
    set "text=%%p"
)

echo your text is %text%
pause
exit /b
-->

<html>
<head><title>text submitter</title></head>
<body>

    <script language='javascript' >
        function pipeText() {
            var pass=document.getElementById('pass').value;
            var fso= new ActiveXObject('Scripting.FileSystemObject').GetStandardStream(1);
            close(fso.Write(pass));

        }
    </script>

    <input type='text' name='pass' size='15'></input>
    <hr>
    <button onclick='pipeText()'>Submit</button>

</body>
</html>