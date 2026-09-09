(ns kotoba.lsp.range
  "range -- addressed on its own.

  Split out of kotoba.lang.lsp on 2026-09-09 (ADR-2609091200). The unit
  here is the DEFINITION, and this repo's deps.edn names exactly the
  definitions it reaches -- nothing else.
"
  )

(defn range
  "Construct a range from two positions."
  [start end] {:start start :end end})
