# Especificação do Projeto — Diário de Rede

## 1. Objetivo da Aplicação
A aplicação tem como objetivo monitorizar em tempo real o estado da ligação de rede do dispositivo (Wi-Fi, Dados Móveis ou Sem Ligação) e permitir o registo de notas manuais associadas a eventos de rede com carimbo de data/hora automático.

## 2. Descrição das Funcionalidades
* **Deteção de Rede Real:** Identificação contínua do estado da conetividade através das APIs de sistema do Android.
* **Criar e Guardar Notas:** Permite a introdução manual de observações sobre a rede.
* **Registo Temporal:** Captura automática do timestamp (data e hora) no momento da criação de cada nota.
* **Histórico:** Apresentação das notas registadas numa lista.

## 3. Descrição das Activities e Navegação
* **`MainActivity`:** Ecran principal que exibe o estado atual da rede (Wi-Fi / Dados Móveis / Offline) e a lista de notas registadas. Contém um botão para navegar para a criação de notas.
* **`NoteActivity`:** Ecran secundário com formulário para introdução de texto da nova nota e botão para guardar.
* **Navegação:** A transição entre a `MainActivity` e a `NoteActivity` é realizada através de `Intent` explícito.

## 4. Funcionalidade de Rede e Permissões
* **Funcionalidade Utilizada:** Deteção de conetividade via `ConnectivityManager` e `NetworkCapabilities`.
* **Permissões Declaradas (`AndroidManifest.xml`):**
  * `android.permission.ACCESS_NETWORK_STATE` (Para ler o estado da ligação)
  * `android.permission.INTERNET`

## 5. Informação Relevante para Execução
* Requer Android 5.0 (API nível 21) ou superior.
* O ficheiro executável `app-debug.apk` encontra-se na raiz do repositório para instalação direta.
