-export([bar/0]).
bar() ->
  io:format(1, 1, []),
  io:fwrite(<warning>"   "</warning>, [1]),
  io:format(<warning>"~p"</warning>, [1, 1]),
  io:format(1, <warning>""</warning>, [1]),
  io_lib:format(<warning>"~~"</warning>, [1]),
  io:format("~~~~"),
  io_lib:format("", 1),
  io_lib:format(<warning>"    f9_dmt_type:new(~p, ~p[]).~n~n"</warning>, [1]),
  io_lib:format("blah" "", []),
  io_lib:format(1, [1,2]),
  P = 1, Arg = 1, io_lib:format("~." ++ integer_to_list(P) ++ "g", [Arg]),
  io:format("~n~w~x~p~~", Arg),
  io:format("<warning>~..~</warning>", Arg),
  io:format("~ln", []),
  io:format("~10.10.xw", [1]),
  io:format("~-10.10.xw", [1]),
  io:format("~*.*.*w", [1, 2, 3, 4]),
  io:format(<warning>"~*w"</warning>, [1]),
  io:format(<warning>"~*.*.xlw"</warning>, [1, 2]),
  io:format("~..\tlp", [1]),
  io:format(<warning>"~..w~"</warning>, [boo]),
  io:format(<warning>"~P"</warning>, [x]),
  io:format("~P", [x, 10]),
  io:format(<warning>"~*.*.*P"</warning>, [10, 10, 10, x]),
  io:format("~*.*.*P", [10, 10, 10, x, 2]).