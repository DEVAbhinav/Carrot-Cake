#!/bin/bash


git pull
pause
git add .
pause
echo Enter a commit message
set /p commitMessage = 
git commit -m %commitMessage%
git push 
pause
