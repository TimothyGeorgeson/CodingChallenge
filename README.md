This project is using Retrofit and RxJava to make the API calls.


Task 1:

MainActivity inflates the activity_main.xml layout.
In activity_main.xml, there are 2 TextViews and one RecyclerView
For TextView displaying title change it to not have all cap.
Make a style for subtitle with everything same as title but font size as 20sp


Task 2:

This task is to populate the recycler view with the names and descriptions of GitHub repos that
include the name "Android".

    * ApiClient.gitApi is provided. This is a Retrofit client and you may retrieve the api call results
      using getRepos (returns a Call) or getReposObservable (returns an RxJava Observable)
    * RepoAdapter is provided. This is an implementation of RecyclerView.Adapter. You may modify
      it as necessary to fit your architecture.


Task 3:

Create a function that retrieves the list of contributors to the RxJava repo on GitHub. Print to
Logcat a list of Author names who have more than 100 commits.