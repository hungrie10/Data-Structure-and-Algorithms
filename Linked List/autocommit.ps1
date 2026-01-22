while ($true) {

  git add .

  $status = git status --porcelain

  if ($status) {
      git commit -m "I love Coding in Java🥰🌟💖😜"
      git push
  }

  Start-Sleep -Seconds 20
}
