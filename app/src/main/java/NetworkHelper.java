package com.example.diarioderede;




import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

public class NetworkHelper {

    public static final String WIFI = "Wi-Fi";
    public static final String DADOS_MOVEIS = "Dados móveis";
    public static final String SEM_LIGACAO = "Sem ligação";

    public static String getConnectionType(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm == null) return SEM_LIGACAO;

        Network network = cm.getActiveNetwork();
        if (network == null) return SEM_LIGACAO;

        NetworkCapabilities caps = cm.getNetworkCapabilities(network);
        if (caps == null) return SEM_LIGACAO;

        if (caps.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
            return WIFI;
        } else if (caps.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
            return DADOS_MOVEIS;
        }
        return SEM_LIGACAO;
    }
}

