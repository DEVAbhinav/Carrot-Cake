#!/bin/bash


git pull
git add .
pause
set /p id="Enter commit Message: "
git commit -m %id%
git push 
pause
