Prava tayyorgarlik — BETA APK (kompyutersiz, GitHub orqali)

1. github.com da bepul hisob oching va yangi repository yarating (masalan: prava-beta).
2. "Add file > Upload files" orqali shu papka ICHIDAGI hamma narsani yuklang
   (settings.gradle fayli repository ildizida turishi kerak).
   Agar ".github" papkasi yuklanmasa: "Add file > Create new file", nomiga
   .github/workflows/build-apk.yml yozing va build-apk.yml faylining matnini joylang.
3. Repository > Actions > "Build APK" > "Run workflow".
4. 3-5 daqiqadan keyin tugagan ishni oching, pastdagi "Artifacts" bo‘limidan
   "prava-beta-apk" ni yuklab oling (zip ichida app-debug.apk).
5. APK ni telefoningizga o‘tkazing va oching. Android "noma’lum manbadan o‘rnatish"
   ruxsatini so‘raydi — ruxsat bering.

Eslatma: bu sinov (debug) versiya, Play Market uchun emas.
Xato chiqsa, Actions’dagi xato matnini menga yuboring.
