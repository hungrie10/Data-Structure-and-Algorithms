while ($true) {
  git add .
  git commit -m "Auto save"
  git remote add origin https://github.com/hungrie10/Data-Structure-and-Algorithms.git
  git branch -M understand
  git push -u origin understand
  Start-Sleep -Seconds 300
}