Feature: testing facebook

  @all
  @test1
  Scenario: testing login page
    Given i open facebook on "chrome"
    When i enter username and password
    Then i land on home page

    @test2
    Scenario Outline: testing login page2
      Given i open facebook on "<Browser>".
      When i enter "<username>" and "<password>"
      Then i land on home page
      Examples:
        |Browser  |username  |password    |
        | Chrome  | makgato  | 122345     |
        | Edge    | makgato2 | 122345@wui |
