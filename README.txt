BETA APK — PAPKASIZ (flat) variant

1. Bu zip'ni 7-Zip bilan papkaga to‘liq chiqarib oling (Извлечь).
2. GitHub'da YANGI repository yarating (masalan: prava-beta).
3. Chiqarilgan papkadagi hamma fayllarni (build.yml dan tashqari ham, hammasini) Ctrl+A bilan belgilab,
   "uploading an existing file" sahifasiga sudrang. Papka kerak emas — hamma fayl bitta joyda turadi.
   Fayl nomlari aynan shunday bo‘lishi kerak: settings.gradle, build.gradle, app-build.gradle, gradle.properties,
   AndroidManifest.xml, MainActivity.java, index.html, ic_launcher.png, build.yml
4. Commit changes.
5. Add file > Create new file: nomiga  .github/workflows/build.yml  yozing (slash papka yaratadi),
   ichiga build.yml faylining matnini joylang. Commit.
6. Actions > Build APK > Run workflow. 3-5 daqiqadan keyin Artifacts > prava-beta-apk.
