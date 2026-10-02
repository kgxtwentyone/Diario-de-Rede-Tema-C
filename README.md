# Diário de Rede (Tema C)

**Turma:** 3L6LASIR3T  

## 👥 Integrantes do Grupo
* Kennedy Gilberto Davuca
* 202401144

---

## 📱 Descrição da Aplicação
O **Diário de Rede** é uma aplicação Android desenvolvida para monitorizar em tempo real o estado da ligação de rede do dispositivo (Wi-Fi, Dados Móveis ou Sem Ligação) e permitir que o utilizador registe notas manuais associadas à qualidade ou eventos da rede, com carimbo de data e hora automático.

---

## ✨ Funcionalidades Implementadas
* **Verificação em Tempo Real:** Identificação automática da conetividade (Wi-Fi, Dados Móveis ou Offline).
* **Gestão de Notas:** Criação e listagem de registos de rede pelo utilizador.
* **Timestamp Automático:** Atribuição automática de data e hora no momento de cada registo.
* **Navegação Multiecrã:** Navegação entre ecra principal e ecra de detalhes/notas via Intents.

---

## 🛠️ Tecnologias e Conceitos Utilizados
* **Linguagem:** Java
* **Interface:** ConstraintLayout e Widgets Android (TextView, EditText, Button, ListView/RecyclerView)
* **Componentes:** 2 Activities (`MainActivity` e `NoteActivity`) com comunicação via `Intent`
* **Rede:** `ConnectivityManager` e `NetworkCapabilities` para deteção de estado real de rede

---

## 🔐 Permissões Utilizadas (`AndroidManifest.xml`)
* `android.permission.ACCESS_NETWORK_STATE` (Para verificar o estado da ligação)
* `android.permission.INTERNET`

---
## 📱 Screenshots da Aplicação

<img width="960" height="540" alt="1" src="https://github.com/user-attachments/assets/5c633285-fa97-4082-83d5-8b8d92b22012" />
<img width="960" height="540" alt="2" src="https://github.com/user-attachments/assets/e45aac5f-794e-4648-bd0b-93143d7e7eab" />
<img width="960" height="540" alt="3" src="https://github.com/user-attachments/assets/895a2705-2c58-4a74-b45e-0c7ca3d04d10" />


## 🚀 Como Executar o Projeto
1. Clona o repositório ou faz download do código-fonte.
2. Abre a pasta do projeto no **Android Studio**.
3. Aguarda a sincronização do Gradle.
4. Executa a aplicação num emulador ou dispositivo físico com Android.
5. Em alternativa, transfere e instala diretamente o ficheiro `app-debug.apk` disponível na raiz do repositório.
