🌍 Idiomas: [English](README.md) | [Português Brasileiro](README.pt-BR.md)

<img src="APK_for_PLAYSTORE/Combo.jpg" alt="Combo Screenshot" width="400">

# UnicaFarmaLDA - Aplicativo Android

Este projeto é um aplicativo Android legado, desenvolvido originalmente em **Eclipse** (quando o Android Studio ainda estava em beta) e posteriormente migrado para o **Android Studio**.  
Ele permite a sincronização entre os dados do telefone e arquivos CSV para gestão farmacêutica.

---

## 📌 Destaques do Projeto

1. **Acesso a Arquivos CSV**  
   O aplicativo acessa a pasta `raw` para ler os arquivos CSV.

2. **Sincronização**  
   Para acessar a página onde os arquivos CSV são lidos, o código realiza a sincronização com os dados do telefone.

3. **Histórico de Desenvolvimento**  
   O código foi criado originalmente no **Eclipse** e posteriormente migrado para o **Android Studio**.

4. **Bibliotecas**  
   As bibliotecas externas estão incluídas como arquivos `.jar` dentro da pasta `libs`. (O Maven ainda não era utilizado nesta fase de desenvolvimento).

---

## 📂 Estrutura do Projeto

- **src/** → Código-fonte Java principal.  
- **res/** → Layouts, drawables e recursos.  
- **raw/** → Contém os arquivos CSV acessados pelo app.  
- **libs/** → Bibliotecas externas (`.jar`).  
- **APK_for_PLAYSTORE/** → APKs compilados e capturas de tela para submissão na Play Store.  

---

## Requisitos

- **Eclipse IDE com plugin ADT** (ambiente original) ou
- **Android Studio** (após a migração).
- Android SDK (a versão depende de `build.gradle` e do manifesto).

---

## Como compilar

1. Abra o projeto no **Android Studio**.
2. Certifique-se de que a versão do Android SDK corresponda às configurações de `build.gradle`.
3. Adicione os arquivos `.jar` necessários de `/libs/` (eles já devem estar incluídos).
4. Compile o projeto (`Build → Make Project`).
5. Execute em um dispositivo ou emulador (`Run → Run App`).

---

## Contexto Histórico

Este projeto mostra o período de transição no desenvolvimento Android:
- **Antes do Gradle/Maven**: os desenvolvedores colocavam manualmente as bibliotecas `.jar` dentro de `/libs/`.
- **Antes do domínio do Android Studio**: Eclipse era o IDE principal.
- **Leitura de CSV através da pasta `raw`**: uma prática comum para agrupar dados estáticos com o aplicativo.

---

## Autor

Criado por: Josemar Pedro.
Data de compilação: Antes de setembro de 2019.

---

## Licença

*Licença MIT

---

## 📸 Capturas de Tela

<img src="APK_for_PLAYSTORE/1.jpg" alt="Screenshot 1" width="400">
<img src="APK_for_PLAYSTORE/2.jpg" alt="Screenshot 2" width="400">
<img src="APK_for_PLAYSTORE/3.jpg" alt="Screenshot 3" width="400">
<img src="APK_for_PLAYSTORE/4.jpg" alt="Screenshot 4" width="400">
<img src="APK_for_PLAYSTORE/5.jpg" alt="Screenshot 5" width="400">
<img src="APK_for_PLAYSTORE/6.jpg" alt="Screenshot 6" width="400">
<img src="APK_for_PLAYSTORE/7.jpg" alt="Screenshot 7" width="400">
<img src="APK_for_PLAYSTORE/8.jpg" alt="Screenshot 8" width="400">
<img src="APK_for_PLAYSTORE/9.jpg" alt="Screenshot 9" width="400">
