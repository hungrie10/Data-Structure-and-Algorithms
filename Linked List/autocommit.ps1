while ($true) {

  git add .

  $status = git status --porcelain

  if ($status) {
      git commit -m "Auto save"
      git push
  }

  Start-Sleep -Seconds 20
}
