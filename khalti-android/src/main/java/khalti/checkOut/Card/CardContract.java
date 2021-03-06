package khalti.checkOut.Card;

import java.util.HashMap;
import java.util.List;

import khalti.checkOut.EBanking.helper.BankPojo;
import khalti.checkOut.EBanking.helper.BankingData;
import rx.Observable;

public interface CardContract {

    interface View {

        void toggleIndented(boolean show);

        void setUpList(List<BankPojo> bankList);

        void showBranding();

        void showIndentedNetworkError();

        void showIndentedError(String error);

        void openMobileForm(BankingData bankingData);

        Observable<HashMap<String, String>> getItemClickObservable();

        HashMap<String, Observable<Void>> setOnClickListener();

        Observable<CharSequence> setSearchListener();

        Observable<Integer> filterList(String text);

        void toggleSearch(boolean show);

        void toggleSearchError(boolean show);

        boolean hasNetwork();

        void setPresenter(CardContract.Presenter presenter);
    }

    interface Presenter {

        void onCreate();

        void onDestroy();
    }

    interface Model {

        Observable<List<BankPojo>> fetchBankList();

        void unSubscribe();
    }
}
