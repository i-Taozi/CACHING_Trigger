-record(rec, {old_field, new_field}).

foo() -> #rec{old_field=10, <caret>new_field=100}