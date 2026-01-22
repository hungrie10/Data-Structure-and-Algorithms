while ($true) {

  git add .

  $status = git status --porcelain

  if ($status) {
      git commit -m "I love Coding in J"
      git push
  }

  Start-Sleep -Seconds 20
}
